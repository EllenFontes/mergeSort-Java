package com.merge.mergesort.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.merge.mergesort.model.Dados;
import com.merge.mergesort.model.MergeSort;

import java.util.Arrays;


@Controller
@RequestMapping("/merge")
public class MergeController extends MergeSort {

    @GetMapping
    public String telaMerge(Model model) {
        model.addAttribute("dados", new Dados());
        return "dados";
    }

    @PostMapping
    public String submitMerge(@ModelAttribute Dados dados, Model model) {
        model.addAttribute("Dados", dados);

        int n1 = dados.getNum1();
        int n2 = dados.getNum2();
        int n3 = dados.getNum3();
        int n4 = dados.getNum4();
        int[] lista = {n1, n2, n3, n4};
        //dados.setList(Arrays.toString(lista));

        int[] vetorAuxiliar = new int[lista.length];
        dados.setList(Arrays.toString(mergeSort(lista, vetorAuxiliar, 0 , lista.length - 1)));
        dados.setLista(lista);

        return "dados";
    }

}

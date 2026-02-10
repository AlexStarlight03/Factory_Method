package com.example;

public class SpeakersProduction {

    public void draw() {
        System.out.println("""
                                    ___
        ___               o/o/
                o/o/               ___
                        _______________     o/o/
        _________________l___________l________________
        l    ___    l oo [::::] [] [] oo l    ___    l
        l  /:::::\\  l--------------------l  /:::::\\  l
        l |:::::::| l  l   __    __   l  l |:::::::| l
        l |:::::::| l  l _(__)__(__)_ l  l |:::::::| l
        l  \\:::::/  l  l______________l  l  \\:::::/  l
        l___________l____________________l___________l

    """);
    }

    
    public SpeakersProduction createObject() {
        System.out.println("Fabrication de haut-parleurs...");
        draw();
        return new SpeakersProduction();
    }
}

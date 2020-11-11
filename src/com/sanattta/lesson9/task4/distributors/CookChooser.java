package com.sanattta.lesson9.task4.distributors;

import com.sanattta.lesson9.task4.cookers.Cooker;

import java.util.List;

public interface CookChooser {

    Cooker chooseCooker(List<Cooker> cookers);

}

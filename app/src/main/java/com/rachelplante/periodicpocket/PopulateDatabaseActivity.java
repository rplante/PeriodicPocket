package com.rachelplante.periodicpocket;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Rachel on 3/7/2018.
 */

public class PopulateDatabaseActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_element);

        DatabaseHandler db = new DatabaseHandler(this);

        //Insert elements
        db.addElement(new Element("Hydrogen", "H", 1, 1.008f, "1", "1", Family.DIATOMIC_NONMETAL, State.GAS, false));
        db.addElement(new Element("Helium", "He", 2, 4.003f, "1", "18", Family.NOBLE_GAS, State.GAS, false));
        db.addElement(new Element("Lithium", "Li", 3, 6.940f, "2", "1", Family.ALKALI_METAL, State.SOLID, false));
        db.addElement(new Element("Beryllium", "Be", 4, 9.012f, "2", "2", Family.ALKALINE_EARTH_METAL, State.SOLID, false));
        db.addElement(new Element("Boron", "B", 5, 10.810f, "2", "13", Family.METALLOID, State.SOLID, false));
        db.addElement(new Element("Carbon", "C", 6, 12.011f, "2", "14", Family.POLYATOMIC_NONMETAL, State.SOLID, false));
        db.addElement(new Element("Nitrogen", "N", 7, 14.007f, "2", "15", Family.DIATOMIC_NONMETAL, State.GAS, false));
        db.addElement(new Element("Oxygen", "O", 8, 15.999f, "2", "16", Family.DIATOMIC_NONMETAL, State.GAS, false));
        db.addElement(new Element("Fluorine", "F", 9, 18.998f, "2", "17", Family.DIATOMIC_NONMETAL, State.GAS, false));
        db.addElement(new Element("Neon", "Ne", 10, 20.180f, "2", "18", Family.NOBLE_GAS, State.GAS, false));
        db.addElement(new Element("Sodium", "Na", 11, 22.990f, "3", "1", Family.ALKALI_METAL, State.SOLID, false));
        db.addElement(new Element("Magnesium", "Mg", 12, 24.305f, "3", "2", Family.ALKALINE_EARTH_METAL, State.SOLID, false));
        db.addElement(new Element("Aluminum", "Al", 13, 26.982f, "3", "13", Family.POST_TRANSITION_METAL, State.SOLID, false));
        db.addElement(new Element("Silicon", "Si", 14, 28.085f, "3", "14", Family.METALLOID, State.SOLID, false));
        db.addElement(new Element("Phosphorus", "P", 15, 30.974f, "3", "15", Family.POLYATOMIC_NONMETAL, State.SOLID, false));
        db.addElement(new Element("Sulfur", "S", 16, 32.060f, "3", "16", Family.POLYATOMIC_NONMETAL, State.SOLID, false));
        db.addElement(new Element("Chlorine", "Cl", 17, 35.450f, "3", "17", Family.DIATOMIC_NONMETAL, State.GAS, false));
        db.addElement(new Element("Argon", "Ar", 18, 39.948f, "3", "18", Family.NOBLE_GAS, State.GAS, false));
        db.addElement(new Element("Potassium", "K", 19, 39.098f, "4", "1", Family.ALKALI_METAL, State.SOLID, false));
        db.addElement(new Element("Calcium", "Ca", 20, 40.078f, "4", "2", Family.ALKALINE_EARTH_METAL, State.SOLID, false));
        db.addElement(new Element("Scandium", "Sc", 21, 44.956f, "4", "3", Family.TRANSITION_METAL, State.SOLID, false));
        db.addElement(new Element("Titanium", "Ti", 22, 47.867f, "4", "4", Family.TRANSITION_METAL, State.SOLID, false));
        db.addElement(new Element("Vanadium", "V", 23, 50.942f, "4", "5", Family.TRANSITION_METAL, State.SOLID, false));
        db.addElement(new Element("Chromium", "Cr", 24, 51.996f, "4", "6", Family.TRANSITION_METAL, State.SOLID, false));
        db.addElement(new Element("Manganese", "Mn", 25, 54.938f, "4", "7", Family.TRANSITION_METAL, State.SOLID, false));
        db.addElement(new Element("Iron", "Fe", 26, 55.845f, "4", "8", Family.TRANSITION_METAL, State.SOLID, false));
        db.addElement(new Element("Cobalt", "Co", 27, 58.933f, "4", "9", Family.TRANSITION_METAL, State.SOLID, false));
        db.addElement(new Element("Nickel", "Ni", 28, 58.693f, "4", "10", Family.TRANSITION_METAL, State.SOLID, false));
        db.addElement(new Element("Copper", "Cu", 29, 63.546f, "4", "11", Family.TRANSITION_METAL, State.SOLID, false));
        db.addElement(new Element("Zinc", "Zn", 30, 65.380f, "4", "12", Family.POST_TRANSITION_METAL, State.SOLID, false));
        db.addElement(new Element("Gallium", "Ga", 31, 69.723f, "4", "13", Family.POST_TRANSITION_METAL, State.SOLID, false));
        db.addElement(new Element("Germanium", "Ge", 32, 72.630f, "4", "14", Family.METALLOID, State.SOLID, false));
        db.addElement(new Element("Arsenic", "As", 33, 74.922f, "4", "15", Family.METALLOID, State.SOLID, false));
        db.addElement(new Element("Selenium", "Se", 34, 78.971f, "4", "16", Family.POLYATOMIC_NONMETAL, State.SOLID, false));
        db.addElement(new Element("Bromine", "Br", 35, 79.904f, "4", "17", Family.DIATOMIC_NONMETAL, State.LIQUID, false));
        db.addElement(new Element("Krypton", "Kr", 36, 83.798f, "4", "18", Family.NOBLE_GAS, State.GAS, false));
        db.addElement(new Element("Rubidium", "Rb", 37, 85.468f, "5", "1", Family.ALKALI_METAL, State.SOLID, false));
        db.addElement(new Element("Strontium", "Sr", 38, 87.620f, "5", "2", Family.ALKALINE_EARTH_METAL, State.SOLID, false));
        db.addElement(new Element("Yttrium", "Y", 39, 88.906f, "5", "3", Family.TRANSITION_METAL, State.SOLID, false));
        db.addElement(new Element("Zirconium", "Zr", 40, 91.224f, "5", "4", Family.TRANSITION_METAL, State.SOLID, false));
        db.addElement(new Element("Niobium", "Nb", 41, 92.906f, "5", "5", Family.TRANSITION_METAL, State.SOLID, false));
        db.addElement(new Element("Molybdenum", "Mo", 42, 95.950f, "5", "6", Family.TRANSITION_METAL, State.SOLID, false));
        db.addElement(new Element("Technetium", "Tc", 43, 98.000f, "5", "7", Family.TRANSITION_METAL, State.SOLID, true));
        db.addElement(new Element("Ruthenium", "Ru", 44, 101.070f, "5", "8", Family.TRANSITION_METAL, State.SOLID, false));
        db.addElement(new Element("Rhodium", "Rh", 45, 102.906f, "5", "9", Family.TRANSITION_METAL, State.SOLID, false));
        db.addElement(new Element("Palladium", "Pd", 46, 106.420f, "5", "10", Family.TRANSITION_METAL, State.SOLID, false));
        db.addElement(new Element("Silver", "Ag", 47, 107.868f, "5", "11", Family.TRANSITION_METAL, State.SOLID, false));
        db.addElement(new Element("Cadmium", "Cd", 48, 112.414f, "5", "12", Family.POST_TRANSITION_METAL, State.SOLID, false));
        db.addElement(new Element("Indium", "In", 49, 114.818f, "5", "13", Family.POST_TRANSITION_METAL, State.SOLID, false));
        db.addElement(new Element("Tin", "Sn", 50, 118.710f, "5", "14", Family.POST_TRANSITION_METAL, State.SOLID, false));
        db.addElement(new Element("Antimony", "Sb", 51, 121.760f, "5", "15", Family.METALLOID, State.SOLID, false));
        db.addElement(new Element("Tellurium", "Te", 52, 127.600f, "5", "16", Family.METALLOID, State.SOLID, false));
        db.addElement(new Element("Iodine", "I", 53, 126.904f, "5", "17", Family.DIATOMIC_NONMETAL, State.SOLID, false));
        db.addElement(new Element("Xenon", "Xe", 54, 131.293f, "5", "18", Family.NOBLE_GAS, State.GAS, false));
        db.addElement(new Element("Cesium", "Cs", 55, 132.905f, "6", "1", Family.ALKALI_METAL, State.SOLID, false));
        db.addElement(new Element("Barium", "Ba", 56, 137.327f, "6", "2", Family.ALKALINE_EARTH_METAL, State.SOLID, false));
        db.addElement(new Element("Lanthanum", "La", 57, 138.905f, "6a", "3", Family.LANTHANIDE, State.SOLID, false));
        db.addElement(new Element("Cerium", "Ce", 58, 140.116f, "6a", "4", Family.LANTHANIDE, State.SOLID, false));
        db.addElement(new Element("Praseodymium", "Pr", 59, 140.908f, "6a", "5", Family.LANTHANIDE, State.SOLID, false));
        db.addElement(new Element("Neodymium", "Nd", 60, 144.242f, "6a", "6", Family.LANTHANIDE, State.SOLID, false));
        db.addElement(new Element("Promethium", "Pm", 61, 145.000f, "6a", "7", Family.LANTHANIDE, State.SOLID, true));
        db.addElement(new Element("Samarium", "Sm", 62, 150.360f, "6a", "8", Family.LANTHANIDE, State.SOLID, false));
        db.addElement(new Element("Europium", "Eu", 63, 151.964f, "6a", "9", Family.LANTHANIDE, State.SOLID, false));
        db.addElement(new Element("Gadolinium", "Gd", 64, 157.250f, "6a", "10", Family.LANTHANIDE, State.SOLID, false));
        db.addElement(new Element("Terbium", "Tb", 65, 158.925f, "6a", "11", Family.LANTHANIDE, State.SOLID, false));
        db.addElement(new Element("Dysprosium", "Dy", 66, 162.500f, "6a", "12", Family.LANTHANIDE, State.SOLID, false));
        db.addElement(new Element("Holmium", "Ho", 67, 164.930f, "6a", "13", Family.LANTHANIDE, State.SOLID, false));
        db.addElement(new Element("Erbium", "Er", 68, 167.259f, "6a", "14", Family.LANTHANIDE, State.SOLID, false));
        db.addElement(new Element("Thulium", "Tm", 69, 168.934f, "6a", "15", Family.LANTHANIDE, State.SOLID, false));
        db.addElement(new Element("Ytterbium", "Yb", 70, 173.045f, "6a", "16", Family.LANTHANIDE, State.SOLID, false));
        db.addElement(new Element("Lutetium", "Lu", 71, 174.967f, "6a", "17", Family.LANTHANIDE, State.SOLID, false));
        db.addElement(new Element("Hafnium", "Hf", 72, 178.490f, "6", "4", Family.TRANSITION_METAL, State.SOLID, false));
        db.addElement(new Element("Tantalum", "Ta", 73, 180.948f, "6", "5", Family.TRANSITION_METAL, State.SOLID, false));
        db.addElement(new Element("Tungsten", "W", 74, 183.840f, "6", "6", Family.TRANSITION_METAL, State.SOLID, false));
        db.addElement(new Element("Rhenium", "Re", 75, 186.207f, "6", "7", Family.TRANSITION_METAL, State.SOLID, false));
        db.addElement(new Element("Osmium", "Os", 76, 190.230f, "6", "8", Family.TRANSITION_METAL, State.SOLID, false));
        db.addElement(new Element("Iridium", "Ir", 77, 192.217f, "6", "9", Family.TRANSITION_METAL, State.SOLID, false));
        db.addElement(new Element("Platinum", "Pt", 78, 195.084f, "6", "10", Family.TRANSITION_METAL, State.SOLID, false));
        db.addElement(new Element("Gold", "Au", 79, 196.967f, "6", "11", Family.TRANSITION_METAL, State.SOLID, false));
        db.addElement(new Element("Mercury", "Hg", 80, 200.592f, "6", "12", Family.POST_TRANSITION_METAL, State.LIQUID, false));
        db.addElement(new Element("Thallium", "Tl", 81, 204.380f, "6", "13", Family.POST_TRANSITION_METAL, State.SOLID, false));
        db.addElement(new Element("Lead", "Pb", 82, 207.200f, "6", "14", Family.POST_TRANSITION_METAL, State.SOLID, false));
        db.addElement(new Element("Bismuth", "Bi", 83, 208.980f, "6", "15", Family.POST_TRANSITION_METAL, State.SOLID, false));
        db.addElement(new Element("Polonium", "Po", 84, 209.000f, "6", "16", Family.POST_TRANSITION_METAL, State.SOLID, true));
        db.addElement(new Element("Astatine", "At", 85, 210.000f, "6", "17", Family.METALLOID, State.SOLID, true));
        db.addElement(new Element("Radon", "Rn", 86, 222.000f, "6", "18", Family.NOBLE_GAS, State.GAS, true));
        db.addElement(new Element("Francium", "Fr", 87, 223.000f, "7", "1", Family.ALKALI_METAL, State.SOLID, true));
        db.addElement(new Element("Radium", "Ra", 88, 226.000f, "7", "2", Family.ALKALINE_EARTH_METAL, State.SOLID, true));
        db.addElement(new Element("Actinium", "Ac", 89, 227.000f, "7a", "3", Family.ACTINIDE, State.SOLID, true));
        db.addElement(new Element("Thorium", "Th", 90, 232.038f, "7a", "4", Family.ACTINIDE, State.SOLID, true));
        db.addElement(new Element("Protactinium", "Pa", 91, 231.036f, "7a", "5", Family.ACTINIDE, State.SOLID, true));
        db.addElement(new Element("Uranium", "U", 92, 238.029f, "7a", "6", Family.ACTINIDE, State.SOLID, true));
        db.addElement(new Element("Neptunium", "Np", 93, 237.000f, "7a", "7", Family.ACTINIDE, State.SOLID, true));
        db.addElement(new Element("Plutonium", "Pu", 94, 244.000f, "7a", "8", Family.ACTINIDE, State.SOLID, true));
        db.addElement(new Element("Americium", "Am", 95, 243.000f, "7a", "9", Family.ACTINIDE, State.SOLID, true));
        db.addElement(new Element("Curium", "Cm", 96, 247.000f, "7a", "10", Family.ACTINIDE, State.SOLID, true));
        db.addElement(new Element("Berkelium", "Bk", 97, 247.000f, "7a", "11", Family.ACTINIDE, State.SOLID, true));
        db.addElement(new Element("Californium", "Cf", 98, 251.000f, "7a", "12", Family.ACTINIDE, State.SOLID, true));
        db.addElement(new Element("Einsteinium", "Es", 99, 252.000f, "7a", "13", Family.ACTINIDE, State.SOLID, true));
        db.addElement(new Element("Fermium", "Fm", 100, 257.000f, "7a", "14", Family.ACTINIDE, State.UNKNOWN, true));
        db.addElement(new Element("Mendelevium", "Md", 101, 258.000f, "7a", "15", Family.ACTINIDE, State.UNKNOWN, true));
        db.addElement(new Element("Nobelium", "No", 102, 259.000f, "7a", "16", Family.ACTINIDE, State.UNKNOWN, true));
        db.addElement(new Element("Lawrencium", "Lr", 103, 262.000f, "7a", "17", Family.ACTINIDE, State.UNKNOWN, true));
        db.addElement(new Element("Rutherfordium", "Rf", 104, 267.000f, "7", "4", Family.TRANSITION_METAL, State.UNKNOWN, true));
        db.addElement(new Element("Dubnium", "Db", 105, 268.000f, "7", "5", Family.TRANSITION_METAL, State.UNKNOWN, true));
        db.addElement(new Element("Seaborgium", "Sg", 106, 269.000f, "7", "6", Family.TRANSITION_METAL, State.UNKNOWN, true));
        db.addElement(new Element("Bohrium", "Bh", 107, 270.000f, "7", "7", Family.TRANSITION_METAL, State.UNKNOWN, true));
        db.addElement(new Element("Hassium", "Hs", 108, 269.000f, "7", "8", Family.TRANSITION_METAL, State.UNKNOWN, true));
        db.addElement(new Element("Meitnerium", "Mt", 109, 278.000f, "7", "9", Family.UNKNOWN, State.UNKNOWN, true));
        db.addElement(new Element("Darmstadtium", "Ds", 110, 281.000f, "7", "10", Family.UNKNOWN, State.UNKNOWN, true));
        db.addElement(new Element("Roentgenium", "Rg", 111, 280.000f, "7", "11", Family.UNKNOWN, State.UNKNOWN, true));
        db.addElement(new Element("Copernicium", "Cn", 112, 285.000f, "7", "12", Family.POST_TRANSITION_METAL, State.UNKNOWN, true));
        db.addElement(new Element("Nihonium", "Nh", 113, 286.000f, "7", "13", Family.UNKNOWN, State.UNKNOWN, true));
        db.addElement(new Element("Flerovium", "Fl", 114, 289.000f, "7", "14", Family.UNKNOWN, State.UNKNOWN, true));
        db.addElement(new Element("Moscovium", "Mc", 115, 289.000f, "7", "15", Family.UNKNOWN, State.UNKNOWN, true));
        db.addElement(new Element("Livermorium", "Lv", 116, 293.000f, "7", "16", Family.UNKNOWN, State.UNKNOWN, true));
        db.addElement(new Element("Tennessine", "Ts", 117, 294.000f, "7", "17", Family.UNKNOWN, State.UNKNOWN, true));
        db.addElement(new Element("Oganesson", "Og", 118, 294.000f, "7", "18", Family.UNKNOWN, State.UNKNOWN, true));
    }
}

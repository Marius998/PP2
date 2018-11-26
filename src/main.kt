fun main(args: Array<String>) {
    println("Test du Lurch")
    val p1 = Product("Käse",3.20,10);
    val p2 = Product("Schinken",1.30,4);
    val p3 = Product("Toast",0.99,26);
    val p4 = Product("Salami",2.45,12);
    val p5 = Product("Bacon",2.30,44);
    val liste : MutableList<Product> = mutableListOf(p1,p2,p3,p4,p5);
    val p6 = Product("Mais",1.00,24);
    val p7 = Product("Gold",201.0,24);
    val p8 = Product("Budder",1.10,24);

    liste+=p6;
    liste+=p7;
    liste+=p8;

    for(product in liste){
        println(product);
    }
    val pbzchnung = "Käse"
    val productMapped = liste.map { it-> it.title}
    println("Mapped List")
    for(a in productMapped){
        println(a)
    }


    val oneEuroProducts = liste.filter { it.price > 1}
    println("Teurer als 1€")
    for(a in oneEuroProducts){
        println(a)
    }

    val countHighValues = liste.count { (it.price*it.amount)>100}
    println("High Values"+countHighValues);


    val checkAllMinPrice = liste.all {it.price>0.1}
    println("Alle mehr als 10ct ->"+checkAllMinPrice);

    val checkAnyMinPrice = liste.any { it.price>200}
    println("Eins mehr als 200€ ->"+checkAnyMinPrice);

    val sublist = liste.subList(0,2);
    println("Sublist  "+sublist);

    var preis = 0.0;
    liste.forEach { preis+=it.price}
    println("Preis von allem : $preis");


    val gesamtWert = liste.fold( 0.0 , { gesamtWert, it -> gesamtWert+it.price  } )
    println(" Preis von allem (2) : "+gesamtWert)

    val countProducts = liste.filter { it.price>1.00 }.map{ it -> it.price*0.8 }.count { it>1.00}
    println(countProducts)

}



fun salesBoost (type: DiscountTypes) : (Double) -> Double {
    val defaultDiscount = 0.9
    return when (type) {
        DiscountTypes.MWST_SPAREN -> { price: Double -> price / 1.19 }
        DiscountTypes.STD_DISCOUNT -> { price: Double -> price * defaultDiscount }
        DiscountTypes.DISCOUNT_ON_EXPENSIVE_ITEMS -> { price: Double -> price / 1.3 }
        DiscountTypes.DOUBLE_DISCOUNT -> { price: Double -> price * (defaultDiscount * 2) }
        else -> { price: Double -> price }
    }
}


fun any ( list : List<Product> , bedingung : (Product)->Boolean ) : Boolean {

    for (elem in list){
        if(elem)
    }

}
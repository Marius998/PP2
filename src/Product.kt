class Product(val title : String, val price : Double, var amount : Int ) {

    override  fun toString() : String {
        return this.title;
    }
}
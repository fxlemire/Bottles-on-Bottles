package bottlesonbottles

class Product {

    static searchable = true;
    Category category
    static belongsTo = Category
    
    String name //Name of product
    String upc //Universal Product Code
    String aoc //Special Regional Distiction 
    String description //Product Description
    byte[] image // path to image
    int price //price of product
    String country //country of origin 
    String size // volume / quanity
    int percent // percentage alcohol content
    int age // year bottled / years rested
    
    static mapping = {
        table 'product'
        name column: 'name'
        upc column: 'UPC'
        aoc column: 'AOC'
        description column: 'description'
        image column: 'image'
        price column: 'price'
        country column: 'country'
        size column: 'size'
        percent column: 'percent'
        age column: 'age'
    }
    
    static constraints = {
        name(blank: false)
        upc(blank: false, unique: true)
        aoc()
        description()
        image(maxSize: 1024*1024*2)
        price(blank: false)
        country()
        size(blank: false)
        percent(min:0, max:100)
        age()
    }
    
    String toString() {
        "$name, $percent%, \$$price"
    }
}

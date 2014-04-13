package bottlesonbottles

class Product {

    Category category
    static belongsTo = Category
    
    String name //Name of product
    String upc //Universal Product Code
    String aoc //Special Regional Distiction 
    String description //Product Description
    String image // path to image
    String price //price of product
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
        aoc(blank:true, nullable: true)
        description(blank:true, nullable: true)
        image(blank:true, nullable: true)
        price(blank:true, nullable: true)
        country(blank:true, nullable: true)
        size(blank:true, nullable: true)
        percent(blank:true, nullable: true)
        age(blank:true, nullable: true)
    }
    
    String toString() {
        "$name, $percent%, \$$price"
    }
}

package bottlesonbottles

class Category {
    
    static searchable = true;
    static hasMany = [products: Product]
    
    String name
    String description
    String image
    
    static mapping = {
        name column: 'name'
        description column: 'description'
        image column: 'image'
    }
    static constraints = {
        name(blank: false)
        description(blank:true, nullable: true)
        image(blank:true, nullable: true)
    }
    
    String toString() {
        name
    }
}

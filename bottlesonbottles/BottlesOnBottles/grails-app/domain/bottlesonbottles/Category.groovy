package bottlesonbottles

class Category {

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
        description()
        image()
    }
    
    String toString() {
        name
    }
}

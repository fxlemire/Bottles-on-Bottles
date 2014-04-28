package bottlesonbottles

class Category {
    
    static searchable = true;
    static hasMany = [products: Product]
    
    String name
    String description
    byte[] image
    
    static mapping = {
        name column: 'name'
        description column: 'description'
        image column: 'image'
    }
    static constraints = {
        name(blank: false)
        description(blank:true, nullable: true)
        image(maxSize: 1024*1024*2)
    }
    
    String toString() {
        name
    }
}

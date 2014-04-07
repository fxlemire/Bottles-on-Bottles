package category

class Category {
    String name
    String description
    String image
    
    static mapping = {
        name column: 'name'
        description column: 'description'
        image column: 'image'
    }
    static constraints = {
    }
}

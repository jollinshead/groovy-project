package com.project

class Project {

    static void main(String[] args) {
        new Project().process()
    }

    private void process() {
        def service = new MongoService(databaseName: 'mongo')
        def foo = service.collection('clients')

        def data = [
                [firstName: 'Jane', lastName: 'Doe', savings: NumberDecimal("232.099")],
                [firstName: 'Elvis', lastName: 'Presley', savings: NumberDecimal("77.6442")]
        ].collect { it as BasicDBObject }

        foo.insert(data)

        foo.find().toArray().each {
            println it
        }
    }
}

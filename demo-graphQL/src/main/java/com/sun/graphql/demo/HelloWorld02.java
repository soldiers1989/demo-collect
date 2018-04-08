package com.sun.graphql.demo;

import graphql.Scalars;
import graphql.schema.GraphQLFieldDefinition;
import graphql.schema.GraphQLObjectType;

public class HelloWorld02 {

    public static void main(String[] args) {

        /*type Foo {
            bar: String
        }*/

        // create for the type of Foo
        GraphQLObjectType fooType = GraphQLObjectType.newObject()
                .name("Foo")
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("bar")
                        .type(Scalars.GraphQLString))
                .build();


    }
}
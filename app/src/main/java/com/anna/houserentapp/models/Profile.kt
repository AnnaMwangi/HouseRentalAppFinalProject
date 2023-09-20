package com.anna.houserentapp.models

class Profile{
    var name:String=""
    var housenumber:String=""
    var contact:String=""
    var numberoffamilymembers:String=""

    constructor(name:String,housenumber:String,contact:String,numberoffamilymembers:String){
        this.name=name
        this.housenumber=housenumber
        this.contact=contact
        this.numberoffamilymembers=numberoffamilymembers
    }
    constructor()
}

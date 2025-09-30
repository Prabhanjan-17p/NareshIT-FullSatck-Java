import React from "react";
import { DataCard } from "../Controlled-Components/class-component-data-card";


export class ClassControledComponent extends React.Component{

    constructor(){
        super();
    }

    render(){
        return(
            <div className="container-fluid">
                <h2>Product Details</h2>
                <DataCard cardTitle="Realme TV" items={['LED','QLED','OLED']} />
            </div>
        )
    }
}
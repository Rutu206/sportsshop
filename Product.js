import React from 'react'
import { Link } from "react-router-dom";
import { Component } from "react";
import ProductStyle from "./ProductStyle.css";
import ListProduct from './components/ListProduct';

function Product() {
    return(
        <div className='back'>
            <Link to={'./dash'}><button id="nav-button">Logout</button></Link>
            <Link to={'./cart'}><button id="nav-button">Cart</button></Link>
            <div className='poster1'><h1>List of Products</h1></div>
            <div>
                

            </div>
            <div>

            </div>
        </div>
    
    )

}

export default Product
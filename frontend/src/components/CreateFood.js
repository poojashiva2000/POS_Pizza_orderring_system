import React, { useEffect, useState } from "react";
import axios from "axios";
// import Header from '../Header'
// import Footer from '../Footer'
// import './Store.css'

function CreateFood() {
  const [foodID1, setFoodID] = useState();
  const [name1, setName] = useState("");
  const [type1, setType] = useState("");
  const [foodSize1, setFoodSize] = useState("");
  const [quantity1, setQuantity] = useState("");
  const [price1, setPrice] = useState("");
  const [obj, setObj] = useState({});
  const handeSubmit = (e) => {
    e.preventDefault();
    console.log(
      foodID1 +
        "" +
        name1 +
        "" +
        type1 +
        "" +
        foodSize1 +
        "" +
        quantity1 +
        "" +
        price1
    );
    const data = {
      foodID: foodID1,
      name: name1,
      type: type1,
      foodSize: foodSize1,
      quantity: quantity1,
      price: price1,
    };
    setObj({
      name: name1,
      type: type1,
      foodSize: foodSize1,
      quantity: quantity1,
      price: price1,
    });
    const ele = JSON.stringify(obj);
    //  console.log(name+' '+electionDate+' '+district+' '+constituency+' '+countingDate);

    axios
      .post("http://localhost:8080/admin/addFood", data)
      .then((rej) => alert("Data is added successfully"));
  };
  return (
    <div>
      <div className="g">
        {/* <Header/> */}
        <div className="container2">
          <h1 style={{ display: "flex", justifyContent: "center" }}>
            FOOD DETAILS
          </h1>
          <form
            onSubmit={handeSubmit}
            style={{
              display: "flex",
              flexDirection: "column",
              alignItems: "center",
              marginTop: "20px",
            }}
          >
            Enter FoodID :{" "}
            <input
              type="text"
              value={foodID1}
              onChange={(e) => {
                setFoodID(e.target.value);
              }}
            />
            <br />
            Enter Name :{" "}
            <input
              type="text"
              value={name1}
              onChange={(e) => {
                setName(e.target.value);
              }}
            />
            <br />
            Enter Type :{" "}
            <input
              type="text"
              value={type1}
              onChange={(e) => {
                setType(e.target.value);
              }}
            />
            <br />
            Enter FoodSize :{" "}
            <input
              type="text"
              value={foodSize1}
              onChange={(e) => {
                setFoodSize(e.target.value);
              }}
            />
            <br />
            Enter Quantity:{" "}
            <input
              type="text"
              value={quantity1}
              onChange={(e) => {
                setQuantity(e.target.value);
              }}
            />
            <br />
            Enter Price :{" "}
            <input
              type="text"
              value={price1}
              onChange={(e) => {
                setPrice(e.target.value);
              }}
            />
            <br />
            <button type="submit">Add Food</button>
          </form>
        </div>
      </div>
      {/* <Footer/> */}
    </div>
  );
}

export default CreateFood;

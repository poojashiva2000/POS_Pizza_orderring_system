import React, { useState } from "react";
import axios from "axios";
// import Header from '../Header'
// import Footer from '../Footer'
// import './update.css'
function UpdateFood() {
  
  const [cartID, setCartID] = useState("");
  const [userID, setUserID] = useState("");
  const [foodID, setFoodID] = useState("");
  const [type, setType] = useState("");
  const[name,setName]=useState('');
  const[price,setPrice]=useState('')
  const[foodSize,setFoodSize]=useState('')
  const [quantity, setQuantity] = useState("");
  const [cost, setCost] = useState("");
  const [orderDate, setOrderDate] = useState("");
  const [obj, setObj] = useState({});
  const handleSubmit = (e) => {
    e.preventDefault();

    setObj({
      foodID: foodID,
      name: name,
      type: type,
      foodSize: foodSize,
      quantity: quantity,
      price: price,
    });
    console.log("Object " + JSON.stringify(obj));
    //  console.log(name+' '+electionDate+' '+district+' '+constituency+' '+countingDate);

    axios
      .put("http://localhost:8080/user/updateCart", obj)
      .then((res) => {
        console.log(res.data);
      })
      .catch((err) => {
        console.log(err);
      });
  };
  return (
    <div>
      <div className="x">
        {/* <Header/> */}
        <div className="container2">
          <h1 style={{ display: "flex", justifyContent: "center" }}>
            CART DETAILS
          </h1>
          <form
            onSubmit={handleSubmit}
            style={{
              display: "flex",
              flexDirection: "column",
              alignItems: "center",
              marginTop: "20px",
            }}
          >
            Enter CartID:{" "}
            <input
              type="text"
              value={cartID}
              onChange={(e) => setCartID(e.target.value)}
            />
            <br />
            Enter UserID:{" "}
            <input
              type="text"
              value={userID}
              onChange={(e) => setUserID(e.target.value)}
            />
            <br />
            Enter FoodID:{" "}
            <input
              type="text"
              value={foodID}
              onChange={(e) => setFoodID(e.target.value)}
            />
            <br />
            Enter Type:{" "}
            <input
              type="text"
              value={type}
              onChange={(e) => setType(e.target.value)}
            />
            <br />
            Enter Food Size:{" "}
            <input
              type="text"
              value={foodSize}
              onChange={(e) => setFoodSize(e.target.value)}
            />
            <br />
            Enter Food Name:{" "}
            <input
              type="text"
              value={name}
              onChange={(e) => setName(e.target.value)}
            />
            <br />
            Enter Price:{" "}
            <input
              type="text"
              value={price}
              onChange={(e) => setPrice(e.target.value)}
            />
            <br />
            Enter Quantity:{" "}
            <input
              type="text"
              value={quantity}
              onChange={(e) => setQuantity(e.target.value)}
            />
            <br />
            Enter Cost:{" "}
            <input
              type="text"
              value={cost}
              onChange={(e) => setCost(e.target.value)}
            />
            <br />
            Enter Order Date:{" "}
            <input
              type="text"
              value={orderDate}
              onChange={(e) => setOrderDate(e.target.value)}
            />
            <br />
            <button type="submit">Add Cart</button>
          </form>
        </div>
      </div>
      {/* <Footer/> */}
    </div>
  );
}

export default UpdateFood;

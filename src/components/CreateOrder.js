import React, { useEffect, useState } from "react";
import axios from "axios";
// import Header from '../Header'
// import Footer from '../Footer'
// import './Store.css'

function CreateOrder() {
const [orderId1, setOrderID] = useState("");
const [userId1, setUserID] = useState("");
const [storeId1, setStoreID] = useState("");
const [cartId1, setCartID] = useState("");
const [orderDate1, setOrderDate] = useState("");
const [totalPrice1, setTotalPrice] = useState("");
const [orderStatus1, setOrderStatus] = useState("");
const [street1, setStreet] = useState("");
const [city1, setCity] = useState("");
const [state1, setState] = useState("");
const [pincode1, setPincode] = useState("");
const [mobileNo1, setMobileNo] = useState("");
  const [obj, setObj] = useState({});
  const handeSubmit = (e) => {
    e.preventDefault();
    console.log(
      orderId1 +"" +userId1 + "" + storeId1 + "" + cartId1 +"" +orderDate1 +"" +totalPrice1 + "" +orderStatus1 + ""+street1+""+city1+""+pincode1+""+mobileNo1
    );
    const data = {
        orderID: orderId1,
      userID: userId1,
      storeID: storeId1,
      cartID: cartId1,
      orderDate: orderDate1,
      totalPrice: totalPrice1,
      orderStatus: orderStatus1,
      street: street1,
      city: city1,
      state: state1,
      pincode: pincode1,
      mobileNo: mobileNo1,
    };
    setObj({
      orderId: orderId1,
      userId: userId1,
      storeId: storeId1,
      cartId: cartId1,
      orderDate: orderDate1,
      totalprice: totalPrice1,
      orderStatus: orderStatus1,
      street: street1,
      city: city1,
      state: state1,
      pincode: pincode1,
      mobileNo: mobileNo1,
    });
    const ele = JSON.stringify(obj);
    //  console.log(name+' '+electionDate+' '+district+' '+constituency+' '+countingDate);

    axios
      .post("http://localhost:8080/admin/addOrder", data)
      .then((rej) => alert("Data is added successfully"));
  };
  return (
    <div>
      <div className="g">
        {/* <Header/> */}
        <div className="container2">
          <h1 style={{ display: "flex", justifyContent: "center" }}>
            ORDER DETAILS
          </h1>
          <form
            onSubmit={handeSubmit}
            style={{
              display: "flex",
              justifyContent: "center",
              alignItems: "center",
               flexDirection: "column",
              
              // marginTop: "20px",
            }}
          >
            Enter orderId :{" "}
            <input
              type="text"
              value={orderId1}
              onChange={(e) => {
                setOrderID(e.target.value);
              }}
            />{" "}
            <br />
            Enter userId :{" "}
            <input
              type="text"
              value={userId1}
              onChange={(e) => {
                setUserID(e.target.value);
              }}
            />
            <br />
            Enter storeId :{" "}
            <input
              type="text"
              value={storeId1}
              onChange={(e) => {
                setStoreID(e.target.value);
              }}
            />{" "}
            <br />
            Enter cartId :{" "}
            <input
              type="text"
              value={cartId1}
              onChange={(e) => {
                setCartID(e.target.value);
              }}
            />
            <br />
            Enter orderDate :{" "}
            <input
              type="text"
              value={orderDate1}
              onChange={(e) => {
                setOrderDate(e.target.value);
              }}
            />
            <br />
            Enter totalPrice :{" "}
            <input
              type="text"
              value={totalPrice1}
              onChange={(e) => {
                setTotalPrice(e.target.value);
              }}
            />
            <br />
            Enter orderStatus :{" "}
            <input
              type="text"
              value={orderStatus1}
              onChange={(e) => {
                setOrderStatus(e.target.value);
              }}
            />
            <br />
            Enter Street :{" "}
            <input
              type="text"
              value={street1}
              onChange={(e) => {
                setStreet(e.target.value);
              }}
            />
            <br />
            Enter City :{" "}
            <input
              type="text"
              value={city1}
              onChange={(e) => {
                setCity(e.target.value);
              }}
            />{" "}
            <br />
            Enter State :{" "}
            <input
              type="text"
              value={state1}
              onChange={(e) => {
                setState(e.target.value);
              }}
            />{" "}
            <br />
            Enter Pincode :{" "}
            <input
              type="text"
              value={pincode1}
              onChange={(e) => {
                setPincode(e.target.value);
              }}
            />{" "}
            <br />
            Enter MobileNo :{" "}
            <input
              type="text"
              value={mobileNo1}
              onChange={(e) => {
                setMobileNo(e.target.value);
              }}
            />
            <br />
            <button type="submit">Add Order</button>
          </form>
        </div>
      </div>
      {/* <Footer/> */}
    </div>
  );
}

export default CreateOrder;

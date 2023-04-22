import React, { useEffect, useState } from "react";
import axios from "axios";
// import Header from '../Header'
// import Footer from '../Footer'
// import './Store.css'

function CreateStore() {
  const [storeId1, setStoreId] = useState("");
  const [name1, setName] = useState("");
  const [street1, setStreet] = useState("");
  const [mobileNo1, setMobileNo] = useState("");
  const [city1, setCity] = useState("");
  const [state1, setState] = useState("");
  const [pincode1, setPincode] = useState("");
  const [obj, setObj] = useState({});
  const handeSubmit = (e) => {
    e.preventDefault();
    console.log(
      storeId1 +
        "" +
        name1 +
        "" +
        street1 +
        "" +
        mobileNo1 +
        "" +
        city1 +
        "" +
        state1 +
        "" +
        pincode1
    );
    setObj({
      storeID: storeId1,
      name: name1,
      street: street1,
      mobileNo: mobileNo1,
      city: city1,
      state: state1,
      pincode: pincode1,
    });
    //    const ele=JSON.stringify(obj);
    //  console.log(name+' '+electionDate+' '+district+' '+constituency+' '+countingDate);

    axios
      .post("http://localhost:8080/admin/addStore", obj)
      .then((rej) => alert("Data is added successfully"));
  };
  return (
    <div>
      <div className="g">
        {/* <Header/> */}
        <div
          className="container2"
          style={{
            display: "flex",
            flexDirection: "column",
            justifyContent: "center",
            marginLeft: "5 %",
          }}
        >
          <h1 style={{ display: "flex", justifyContent: "center" }}>
            STORE DETAILS
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
            Enter storeId :{" "}
            <input
              type="text"
              value={storeId1}
              onChange={(e) => {
                setStoreId(e.target.value);
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
            Enter Street :{" "}
            <input
              type="text"
              value={street1}
              onChange={(e) => {
                setStreet(e.target.value);
              }}
            />
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
            Enter City :{" "}
            <input
              type="text"
              value={city1}
              onChange={(e) => {
                setCity(e.target.value);
              }}
            />
            <br />
            Enter State :{" "}
            <input
              type="text"
              value={state1}
              onChange={(e) => {
                setState(e.target.value);
              }}
            />
            <br />
            Enter Pincode :{" "}
            <input
              type="text"
              value={pincode1}
              onChange={(e) => {
                setPincode(e.target.value);
              }}
            />
            <br />
            <button type="submit">Add Store</button>
          </form>
        </div>
      </div>
      {/* <Footer/> */}
    </div>
  );
}

export default CreateStore;

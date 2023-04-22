import React from "react";
// import Home from "./components/Home"
//import Navbar from "./components/Navbar";
import UpdateFood from "./components/UpdateFood";
import CreateStore from "./components/CreateStore";
import UpdateOrder from "./components/UpdateOrder";
import CreateOrder from "./components/CreateOrder";
// import DeleteOrder from "./components/DeleteOrder";
import DeleteStore from "./components/DeleteStore";
import SelectStore from "./components/SelectStore";
import UpdateStore from "./components/UpdateStore";
import DeleteFood from "./components/DeleteFood";
import Login from "./components/Login";

import CreateCart from "./components/CreateCart";
import { Route, Routes } from "react-router-dom";
import CreateFood from "./components/CreateFood";
import SelectFood from "./components/SelectFood";
import UpdateCart from "./components/UpdateCart";

import SelectCart from "./components/SelectCart";
import Header from "./components/Header";
import Footer from "./components/Footer";

function App() {
  return (
    <div
      className="App"
      style={{
        backgroundImage:
          "url(https://freerangestock.com/sample/140599/pizzas-on-dark-taple-top-background--with-copyspace.jpg)",
        backgroundRepeat: "no-repeat",
        width: "100%",
        height: "97vh",
        backgroundSize: "cover",
        backgroundPosition: "center",
      }}
    >
      {/* <div>
        <Login />
        {/* <Registration/> */}
      {/* <CreateCart /> */}

      <Routes>
        <Route path="/" element={<Header />} />
        <Route path="/login" element={<Login />} />
        <Route path="/CreateStore" element={<CreateStore />} />
        <Route path="/DeleteStore" element={<DeleteStore />} />
        <Route path="/Updatestore" element={<UpdateStore />} />
        {/* <Route path="/deletecreditcard" element={<DeleteCreditCard />} /> */}
        <Route path="/Selectstore" element={<SelectStore />} />
        <Route path="/CreateFood" element={<CreateFood />} />
        <Route path="/DeleteFood" element={<DeleteFood />} />
        <Route path="/UpdateFood" element={<UpdateFood />} />
        <Route path="/SelectFood" element={<SelectFood />} />
        <Route path="/UpdateOrder" element={<UpdateOrder />} />
        <Route path="/CreateOrder" element={<CreateOrder />} />
        <Route path="/CreateCart" element={<CreateCart />} />
        <Route path="/SelectCart" element={<SelectCart />} />
        <Route path="/UpdateCart" element={<UpdateCart />} />
        {/* <Route path="/DeleteOrder" element={<DeleteOrder />} /> */}
      </Routes>
    </div>
  );
}
export default App;

import React, { useEffect, useState } from "react";
import axios from "axios";

function CreateCart() {
  const [cartID, setCartID] = useState("");
  const [userID, setUserID] = useState("");
  const [foodID, setFoodID] = useState("");
  const [type, setType] = useState("");
  const [quantity, setQuantity] = useState("");
  const [cost, setCost] = useState("");
  const [orderDate, setOrderDate] = useState("");

  useEffect(() => {
    if (userID) {
      fetchUserCredentials(userID);
    }
  }, [userID]);

  const fetchUserCredentials = async (userID) => {
    try {
      const response = await axios.get(
        `http://localhost:8080/user/credentialid/${userID}`
      );
      const credentialsData = response.data;
      const response2 = await axios.get(`http://localhost:8080/admin/foodid/${foodID}`);
      const foodData = response2.data;
      const newObj = {
        cartID: cartID,
        credentialBean: {
          userID: credentialsData.userId,
          password: credentialsData.password,
          userType: credentialsData.userType,
          loginStatus: credentialsData.loginStatus,
        },
        foodBean: {
          foodID: foodData.foodID,
          name: foodData.name,
          type: foodData.type,
          foodSize: foodData.foodSize,
          quantity: foodData.quantity,
          price: foodData.price,
        },
        type: type,
        quantity: quantity,
        cost: cost,
        orderDate: orderDate,
      };
      axios
        .post("http://localhost:8080/user/addCart", newObj)
        .then((rej) => alert("Data is added successfully"));
    } catch (error) {
      console.error("Error fetching user credentials:", error);
    }
  };

  return (
    <div>
      <div className="g">
        <div className="container2">
          <h1 style={{ display: "flex", justifyContent: "center" }}>
            Cart Details
          </h1>
          <form
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
            Enter Quantity:{" "}
            <input
              type="text"
              value={quantity}
              onChange={(e) => setQuantity(e.target.value)}
            />{" "}
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
    </div>
  );
}

export default CreateCart;

import React, { useEffect, useState } from "react";
import axios from "axios";
// import Header from '../Header';
// import Footer from '../Footer';
// import './Selel.css'
function SelectFood() {
  const [data, setData] = useState([]);

  useEffect(() => {
    axios
      .get("http://localhost:8080/admin/selectAllFood")
      .then((res) => setData(res.data));
  }, []);

  console.log(data);

  return (
    <div>
      <div className="c">
        {/* <Header/> */}
        <div className="s">
          <table border="4">
            <thead>
              <tr>
                <th>FoodID</th>
                <th>Name</th>
                <th>type</th>
                <th>foodSize</th>
                <th>Quantity</th>
                <th>price</th>
              </tr>
            </thead>
            <tbody>
              {data &&
                data.map((item) => (
                  <tr key={item.foodId}>
                    <td>{item.foodID}</td>
                    <td>{item.name}</td>
                    <td>{item.type}</td>

                    <td>{item.foodSize}</td>
                    <td>{item.quantity}</td>
                    <td>{item.price}</td>
                  </tr>
                ))}
            </tbody>
          </table>
        </div>
      </div>
      {/* <Footer/> */}
    </div>
  );
}

export default SelectFood;

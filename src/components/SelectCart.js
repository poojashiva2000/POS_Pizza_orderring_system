import React, { useEffect, useState } from "react";
import axios from "axios";
// import Header from '../Header';
// import Footer from '../Footer';
// import './Selel.css'
function SelectCreditCard() {
  const [data, setData] = useState([]);

  useEffect(() => {
    axios
      .get("http://localhost:8080/user/selectAllCart")
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
                <th>CartID</th>
                <th>UserID</th>
                <th>FoodID</th>
                <th></th>
                <th>UserID</th>
              </tr>
            </thead>
            <tbody>
              {data &&
                data.map((item) => (
                  <tr key={item.creditCardNumber}>
                    <td>{item.creditCardNumber}</td>
                    <td>{item.validFrom}</td>
                    <td>{item.validTo}</td>
                    <td>{item.balance}</td>
                    <td>{item.userId}</td>
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

export default SelectCreditCard;

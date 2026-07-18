import React,{Component} from "react";

class CurrencyConvertor extends Component{

    constructor(props){
        super(props);

        this.state={
            amount:"",
            currency:"Euro"
        };
    }

    handleAmount=(event)=>{
        this.setState({
            amount:event.target.value
        });
    }

    handleCurrency=(event)=>{
        this.setState({
            currency:event.target.value
        });
    }

    handleSubmit=(event)=>{
        event.preventDefault();

        const amount=parseFloat(this.state.amount);
        const currency=this.state.currency.trim().toLowerCase();

        if(currency==="euro"){

            alert("Converting to Rupees Amount is "+(amount*80));

        }
        else if(currency==="rupees"){

            alert("Converting to Euro Amount is "+(amount/80));

        }
        else{

            alert("Please enter either Euro or Rupees");

        }

    }

    render(){

        return(

            <div>

                <h1 style={{color:"green"}}>
                    Currency Convertor!!!
                </h1>

                <form onSubmit={this.handleSubmit}>

                    <table>

                        <tbody>

                            <tr>
                                <td>Amount:</td>
                                <td>
                                    <input
                                        type="number"
                                        value={this.state.amount}
                                        onChange={this.handleAmount}
                                    />
                                </td>
                            </tr>

                            <tr>
                                <td>Currency:</td>
                                <td>
                                    <input
                                        type="text"
                                        value={this.state.currency}
                                        onChange={this.handleCurrency}
                                    />
                                </td>
                            </tr>

                            <tr>
                                <td></td>
                                <td>
                                    <button type="submit">
                                        Submit
                                    </button>
                                </td>
                            </tr>

                        </tbody>

                    </table>

                </form>

            </div>

        );

    }

}

export default CurrencyConvertor;
import "./App.css";
import React,{Component} from "react";
import CurrencyConvertor from "./components/CurrencyConvertor";

class App extends Component{

    constructor(props){

        super(props);

        this.state={
            count:0
        };

    }

    increment=()=>{

        this.setState({
            count:this.state.count+1
        });

    }

    decrement=()=>{

        this.setState({
            count:this.state.count-1
        });

    }

    sayHello=()=>{

        alert("Hello! This is a static message.");

    }

    incrementAndHello=()=>{

        this.increment();
        this.sayHello();

    }

    sayWelcome=(message)=>{

        alert(message);

    }

    syntheticEvent=()=>{

        alert("I was clicked");

    }

    render(){

        return(

            <div className="App">

                <h1>React Event Examples</h1>

                <h2>Counter : {this.state.count}</h2>

                <button onClick={this.incrementAndHello}>
                    Increment
                </button>

                <button onClick={this.decrement}>
                    Decrement
                </button>

                <br/><br/>

                <button
                    onClick={()=>this.sayWelcome("Welcome")}
                >
                    Say Welcome
                </button>

                <br/><br/>

                <button
                    onClick={this.syntheticEvent}
                >
                    OnPress
                </button>

                <hr/>

                <CurrencyConvertor/>

            </div>

        );

    }

}

export default App;
import cx from 'classnames';
import { Component } from 'react';

export default class Counter extends Component {

    render() {
        return (
            <>
                <div>
                    <h2 className='counter'>Counter</h2>
                </div>
                <style>{`
                    .counter-button {
                        font-size: 1rem;
                        padding: 5px 10px;
                        color:  #585858;
                    }
                `}</style>
            </>
        );
    }
}

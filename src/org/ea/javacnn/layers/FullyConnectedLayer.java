package org.ea.javacnn.layers;

import org.ea.javacnn.data.BackPropResult;
import org.ea.javacnn.data.DataBlock;

import java.util.ArrayList;
import java.util.List;

/**
 * Neurons in a fully connected layer have full connections to all
 * activations in the previous layer, as seen in regular Neural Networks.
 * Their activations can hence be computed with a matrix multiplication
 * followed by a bias offset.
 *
 * @author Daniel Persson (mailto.woden@gmail.com)
 */
public class FullyConnectedLayer implements Layer {
    private int num_neurons;

    public FullyConnectedLayer(int num_neurons) {
        this.num_neurons = num_neurons;
    }

    @Override
    public void forward(DataBlock db, boolean training) {

    }

    @Override
    public void backward() {

    }

    @Override
    public List<BackPropResult> getBackPropagationResult() {
        return new ArrayList<BackPropResult>();
    }
}

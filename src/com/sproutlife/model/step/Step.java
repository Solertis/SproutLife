/*******************************************************************************
 * Copyright (c) 2016 Alex Shapiro - github.com/shpralex
 * This program and the accompanying materials
 * are made available under the terms of the The MIT License (MIT)
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *******************************************************************************/
package com.sproutlife.model.step;

import java.util.Collection;

import com.sproutlife.Settings;
import com.sproutlife.model.GameModel;
import com.sproutlife.model.Stats;
import com.sproutlife.model.echosystem.Board;
import com.sproutlife.model.echosystem.Echosystem;
import com.sproutlife.model.echosystem.Organism;

public abstract class Step {   
    
    GameModel gameModel;
     
    public Step(GameModel gameModel) {
        this.gameModel = gameModel;     
    }
      
    public GameModel getGameModel() {
        return gameModel;
    }
    
    public Stats getStats() {
        return gameModel.getStats();
    }
    
    public Echosystem getEchosystem() {
        return gameModel.getEchosystem();
    }
    
    public Collection<Organism> getOrganisms() {
    	return getEchosystem().getOrganisms();
    }
    
    public Board getBoard() {
        return gameModel.getBoard();
    }
    
    public int getTime() {
        return getEchosystem().getTime();
    }        
    
    public Settings getSettings() {
    	return getGameModel().getSettings();
    }
    
    public abstract void perform();
     
}

package com.liuzhy520.myvideoplayer.entity;

import com.liuzhy520.myvideoplayer.core.IPlayer;

/**
 * Created by Wayne on 2016/10/5.
 * this one would use the VLC Player
 */

public class VLCPlayerEntity implements IPlayer{
    @Override
    public void start() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void release() {

    }

    @Override
    public void seekTo(int position) {

    }

    @Override
    public int getCurrentVideoPosition() {
        return 0;
    }

    @Override
    public int getCurrentVideoDuration() {
        return 0;
    }

    @Override
    public boolean isVideoPlaying() {
        return false;
    }
}

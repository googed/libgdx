package com.badlogic.gdx;

import com.badlogic.gdx.audio.AudioDevice;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.files.FileHandle;

public interface Audio 
{
	/**
	 * Creates a new {@link AudioDevice} either in 44.1khz mono
	 * or stereo mode. The AudioDevice has to be disposed via its
	 * {@link AudioDevice.dispose()} method when it is no longer used.
	 * 
	 * @param isMono whether the AudioDevice should be in mono or stereo mode
	 * @return
	 */
	public AudioDevice newAudioDevice( boolean isMono );
	
	/**
	 * Creates a new {@link Sound} which is used to playback audio effects such
	 * as gun shots or explosions. The Sound's audio data is retrieved from the
	 * file specified via the {@link FileHandle}. Note that the complete audio
	 * data is loaded into RAM. You should therefore not load big audio files 
	 * with this methods. Currently supported formats are WAV, MP3 and OGG. The
	 * Sound has to be disposed if it is no longer used via the {@link Sound.dispose()}
	 * method.
	 * 
	 * @param file the FileHandle to the audio file
	 * @return the new Sound or null if the Sound could not be loaded.
	 */
	public Sound newSound( FileHandle fileHandle );
	
	/**
	 * Creates a new {@link Music} instance which is used to playback a music
	 * stream from a file. Currently supported formats are WAV, MP3 and OGG.
	 * The Music has to be disposed if it is no longer used via the {@link Music.dispose()}
	 * method.
	 * 
	 * @param file the FileHandle 
	 * @return the new Music or null if the Music could not be loaded.
	 */
	public Music newMusic( FileHandle file );
}

# Music Made Simple

This repository contains the code of the talk Thomas G. Kristensen gave at ClojureD.

## Getting started

Clone this repository

```
git clone https://github.com/tgk/music-made-simple.git
```

Get in the source repository and start the REPL

```
cd clj && lein repl
```

You can now open the live_demo.clj in your favorite text editor and start fiddling around with music on the REPL.

## Connecting a BUS channel

In the demo I was using OS X which comes with a virtual MIDI bus.

[This article](https://help.ableton.com/hc/en-us/articles/209774225-Using-virtual-MIDI-buses) explains how to set up the IAC MIDI bus on a Mac. Please make a note of the name you pick for your channel.

## Connecting Midi's to the Bus Channel

In the live demo you can run the top snippet to get a list of your MIDI busses:

```
;; List available devices
(for [device-info (MidiSystem/getMidiDeviceInfo)]
  [(.getName device-info)
   (.getDescription device-info)])
```

you should see the name of the bus you created in the IAC configuration. Simple use that name in place of `Bus 1` in `live_demo.clj` to connect to that bus.

To have Helm listen to that bus click the helmet icon in the app and make sure the checkbox is checked next to the name of the bus in the list.

DM1 does not allow you to pick a MIDI bus unless it is created while DM1 is running. I do not know why but that took me a bit of time to discover!
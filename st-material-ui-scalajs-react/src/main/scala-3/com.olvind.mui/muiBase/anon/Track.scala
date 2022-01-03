package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.switchUnstyledSwitchUnstyledMod.SwitchUnstyledComponentsPropsOverrides
import com.olvind.mui.react.mod.HTMLAttributes
import com.olvind.mui.react.mod.InputHTMLAttributes
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Track extends StObject {
  
  var input: js.UndefOr[InputHTMLAttributes[HTMLInputElement] & SwitchUnstyledComponentsPropsOverrides] = js.undefined
  
  var root: js.UndefOr[HTMLAttributes[HTMLSpanElement] & SwitchUnstyledComponentsPropsOverrides] = js.undefined
  
  var thumb: js.UndefOr[HTMLAttributes[HTMLSpanElement] & SwitchUnstyledComponentsPropsOverrides] = js.undefined
  
  var track: js.UndefOr[HTMLAttributes[HTMLSpanElement] & SwitchUnstyledComponentsPropsOverrides] = js.undefined
}
object Track {
  
  inline def apply(): Track = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Track]
  }
  
  extension [Self <: Track](x: Self) {
    
    inline def setInput(value: InputHTMLAttributes[HTMLInputElement] & SwitchUnstyledComponentsPropsOverrides): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setRoot(value: HTMLAttributes[HTMLSpanElement] & SwitchUnstyledComponentsPropsOverrides): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setThumb(value: HTMLAttributes[HTMLSpanElement] & SwitchUnstyledComponentsPropsOverrides): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
    
    inline def setThumbUndefined: Self = StObject.set(x, "thumb", js.undefined)
    
    inline def setTrack(value: HTMLAttributes[HTMLSpanElement] & SwitchUnstyledComponentsPropsOverrides): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
  }
}

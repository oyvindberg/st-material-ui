package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.switchUnstyledSwitchUnstyledMod.SwitchUnstyledComponentsPropsOverrides
import com.olvind.mui.react.mod.HTMLAttributes
import com.olvind.mui.react.mod.InputHTMLAttributes
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Track extends StObject {
  
  var input: js.UndefOr[
    InputHTMLAttributes[HTMLInputElement] with SwitchUnstyledComponentsPropsOverrides
  ] = js.native
  
  var root: js.UndefOr[HTMLAttributes[HTMLSpanElement] with SwitchUnstyledComponentsPropsOverrides] = js.native
  
  var thumb: js.UndefOr[HTMLAttributes[HTMLSpanElement] with SwitchUnstyledComponentsPropsOverrides] = js.native
  
  var track: js.UndefOr[HTMLAttributes[HTMLSpanElement] with SwitchUnstyledComponentsPropsOverrides] = js.native
}
object Track {
  
  @scala.inline
  def apply(): Track = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Track]
  }
  
  @scala.inline
  implicit class TrackMutableBuilder[Self <: Track] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInput(value: InputHTMLAttributes[HTMLInputElement] with SwitchUnstyledComponentsPropsOverrides): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setRoot(value: HTMLAttributes[HTMLSpanElement] with SwitchUnstyledComponentsPropsOverrides): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setThumb(value: HTMLAttributes[HTMLSpanElement] with SwitchUnstyledComponentsPropsOverrides): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbUndefined: Self = StObject.set(x, "thumb", js.undefined)
    
    @scala.inline
    def setTrack(value: HTMLAttributes[HTMLSpanElement] with SwitchUnstyledComponentsPropsOverrides): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
  }
}

package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/styles/experimental_extendTheme.Opacity> */
trait PartialOpacity extends StObject {
  
  var inputPlaceholder: js.UndefOr[Double] = js.undefined
  
  var inputUnderline: js.UndefOr[Double] = js.undefined
  
  var switchTrack: js.UndefOr[Double] = js.undefined
  
  var switchTrackDisabled: js.UndefOr[Double] = js.undefined
}
object PartialOpacity {
  
  inline def apply(): PartialOpacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOpacity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialOpacity] (val x: Self) extends AnyVal {
    
    inline def setInputPlaceholder(value: Double): Self = StObject.set(x, "inputPlaceholder", value.asInstanceOf[js.Any])
    
    inline def setInputPlaceholderUndefined: Self = StObject.set(x, "inputPlaceholder", js.undefined)
    
    inline def setInputUnderline(value: Double): Self = StObject.set(x, "inputUnderline", value.asInstanceOf[js.Any])
    
    inline def setInputUnderlineUndefined: Self = StObject.set(x, "inputUnderline", js.undefined)
    
    inline def setSwitchTrack(value: Double): Self = StObject.set(x, "switchTrack", value.asInstanceOf[js.Any])
    
    inline def setSwitchTrackDisabled(value: Double): Self = StObject.set(x, "switchTrackDisabled", value.asInstanceOf[js.Any])
    
    inline def setSwitchTrackDisabledUndefined: Self = StObject.set(x, "switchTrackDisabled", js.undefined)
    
    inline def setSwitchTrackUndefined: Self = StObject.set(x, "switchTrack", js.undefined)
  }
}

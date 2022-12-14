package com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Opacity extends StObject {
  
  var inputPlaceholder: Double
  
  var inputUnderline: Double
  
  var switchTrack: Double
  
  var switchTrackDisabled: Double
}
object Opacity {
  
  inline def apply(inputPlaceholder: Double, inputUnderline: Double, switchTrack: Double, switchTrackDisabled: Double): Opacity = {
    val __obj = js.Dynamic.literal(inputPlaceholder = inputPlaceholder.asInstanceOf[js.Any], inputUnderline = inputUnderline.asInstanceOf[js.Any], switchTrack = switchTrack.asInstanceOf[js.Any], switchTrackDisabled = switchTrackDisabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Opacity]
  }
  
  extension [Self <: Opacity](x: Self) {
    
    inline def setInputPlaceholder(value: Double): Self = StObject.set(x, "inputPlaceholder", value.asInstanceOf[js.Any])
    
    inline def setInputUnderline(value: Double): Self = StObject.set(x, "inputUnderline", value.asInstanceOf[js.Any])
    
    inline def setSwitchTrack(value: Double): Self = StObject.set(x, "switchTrack", value.asInstanceOf[js.Any])
    
    inline def setSwitchTrackDisabled(value: Double): Self = StObject.set(x, "switchTrackDisabled", value.asInstanceOf[js.Any])
  }
}

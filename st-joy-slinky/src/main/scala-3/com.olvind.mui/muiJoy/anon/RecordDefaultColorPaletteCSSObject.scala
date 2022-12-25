package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiStyledEngine.mod.CSSObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<@mui/joy.@mui/joy/styles/types/colorSystem.DefaultColorPalette, @mui/system.@mui/system.CSSObject> */
trait RecordDefaultColorPaletteCSSObject extends StObject {
  
  var danger: CSSObject
  
  var info: CSSObject
  
  var neutral: CSSObject
  
  var primary: CSSObject
  
  var success: CSSObject
  
  var warning: CSSObject
}
object RecordDefaultColorPaletteCSSObject {
  
  inline def apply(
    danger: CSSObject,
    info: CSSObject,
    neutral: CSSObject,
    primary: CSSObject,
    success: CSSObject,
    warning: CSSObject
  ): RecordDefaultColorPaletteCSSObject = {
    val __obj = js.Dynamic.literal(danger = danger.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], neutral = neutral.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordDefaultColorPaletteCSSObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecordDefaultColorPaletteCSSObject] (val x: Self) extends AnyVal {
    
    inline def setDanger(value: CSSObject): Self = StObject.set(x, "danger", value.asInstanceOf[js.Any])
    
    inline def setInfo(value: CSSObject): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setNeutral(value: CSSObject): Self = StObject.set(x, "neutral", value.asInstanceOf[js.Any])
    
    inline def setPrimary(value: CSSObject): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: CSSObject): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setWarning(value: CSSObject): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
  }
}

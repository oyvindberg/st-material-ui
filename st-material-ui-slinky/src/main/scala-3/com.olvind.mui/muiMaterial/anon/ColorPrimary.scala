package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorPrimary extends StObject {
  
  /** Class name applied to the root element if `color="primary"`. */
  var colorPrimary: js.UndefOr[String] = js.undefined
  
  /** Class name applied to the root element if `color="secondary"`. */
  var colorSecondary: js.UndefOr[String] = js.undefined
  
  /** Class name applied to the root element if `size="small"`. */
  var sizeSmall: js.UndefOr[String] = js.undefined
  
  /** Class name applied to the thumb element if `color="primary"`. */
  var thumbColorPrimary: js.UndefOr[String] = js.undefined
  
  /** Class name applied to the thumb element if `color="secondary"`. */
  var thumbColorSecondary: js.UndefOr[String] = js.undefined
  
  /** Class name applied to the thumb element if `size="small"`. */
  var thumbSizeSmall: js.UndefOr[String] = js.undefined
}
object ColorPrimary {
  
  inline def apply(): ColorPrimary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorPrimary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorPrimary] (val x: Self) extends AnyVal {
    
    inline def setColorPrimary(value: String): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
    
    inline def setColorPrimaryUndefined: Self = StObject.set(x, "colorPrimary", js.undefined)
    
    inline def setColorSecondary(value: String): Self = StObject.set(x, "colorSecondary", value.asInstanceOf[js.Any])
    
    inline def setColorSecondaryUndefined: Self = StObject.set(x, "colorSecondary", js.undefined)
    
    inline def setSizeSmall(value: String): Self = StObject.set(x, "sizeSmall", value.asInstanceOf[js.Any])
    
    inline def setSizeSmallUndefined: Self = StObject.set(x, "sizeSmall", js.undefined)
    
    inline def setThumbColorPrimary(value: String): Self = StObject.set(x, "thumbColorPrimary", value.asInstanceOf[js.Any])
    
    inline def setThumbColorPrimaryUndefined: Self = StObject.set(x, "thumbColorPrimary", js.undefined)
    
    inline def setThumbColorSecondary(value: String): Self = StObject.set(x, "thumbColorSecondary", value.asInstanceOf[js.Any])
    
    inline def setThumbColorSecondaryUndefined: Self = StObject.set(x, "thumbColorSecondary", js.undefined)
    
    inline def setThumbSizeSmall(value: String): Self = StObject.set(x, "thumbSizeSmall", value.asInstanceOf[js.Any])
    
    inline def setThumbSizeSmallUndefined: Self = StObject.set(x, "thumbSizeSmall", js.undefined)
  }
}

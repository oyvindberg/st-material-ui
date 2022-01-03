package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorPrimary extends StObject {
  
  /** Class name applied to the root element if `color="primary"`. */
  var colorPrimary: js.UndefOr[String] = js.native
  
  /** Class name applied to the root element if `color="secondary"`. */
  var colorSecondary: js.UndefOr[String] = js.native
  
  /** Class name applied to the root element if `size="small"`. */
  var sizeSmall: js.UndefOr[String] = js.native
  
  /** Class name applied to the thumb element if `color="primary"`. */
  var thumbColorPrimary: js.UndefOr[String] = js.native
  
  /** Class name applied to the thumb element if `color="secondary"`. */
  var thumbColorSecondary: js.UndefOr[String] = js.native
  
  /** Class name applied to the thumb element if `size="small"`. */
  var thumbSizeSmall: js.UndefOr[String] = js.native
}
object ColorPrimary {
  
  @scala.inline
  def apply(): ColorPrimary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorPrimary]
  }
  
  @scala.inline
  implicit class ColorPrimaryMutableBuilder[Self <: ColorPrimary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColorPrimary(value: String): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorPrimaryUndefined: Self = StObject.set(x, "colorPrimary", js.undefined)
    
    @scala.inline
    def setColorSecondary(value: String): Self = StObject.set(x, "colorSecondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorSecondaryUndefined: Self = StObject.set(x, "colorSecondary", js.undefined)
    
    @scala.inline
    def setSizeSmall(value: String): Self = StObject.set(x, "sizeSmall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeSmallUndefined: Self = StObject.set(x, "sizeSmall", js.undefined)
    
    @scala.inline
    def setThumbColorPrimary(value: String): Self = StObject.set(x, "thumbColorPrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbColorPrimaryUndefined: Self = StObject.set(x, "thumbColorPrimary", js.undefined)
    
    @scala.inline
    def setThumbColorSecondary(value: String): Self = StObject.set(x, "thumbColorSecondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbColorSecondaryUndefined: Self = StObject.set(x, "thumbColorSecondary", js.undefined)
    
    @scala.inline
    def setThumbSizeSmall(value: String): Self = StObject.set(x, "thumbSizeSmall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbSizeSmallUndefined: Self = StObject.set(x, "thumbSizeSmall", js.undefined)
  }
}

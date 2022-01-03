package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typography extends StObject {
  
  /**
    * Props applied to the Typography wrapper of the passed label.
    * This is unused if disableTpography is true.
    * @default {}
    */
  var typography: js.UndefOr[TypographyPropsTypographyTypeMapspandefa] = js.native
}
object Typography {
  
  @scala.inline
  def apply(): Typography = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Typography]
  }
  
  @scala.inline
  implicit class TypographyMutableBuilder[Self <: Typography] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTypography(value: TypographyPropsTypographyTypeMapspandefa): Self = StObject.set(x, "typography", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypographyUndefined: Self = StObject.set(x, "typography", js.undefined)
  }
}

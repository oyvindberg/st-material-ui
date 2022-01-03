package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `74` extends StObject {
  
  /**
    * Props applied to the Typography wrapper of the passed label.
    * This is unused if disableTpography is true.
    * @default {}
    */
  var typography: js.UndefOr[TypographyPropsspanAbout] = js.native
}
object `74` {
  
  @scala.inline
  def apply(): `74` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`74`]
  }
  
  @scala.inline
  implicit class `74MutableBuilder`[Self <: `74`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTypography(value: TypographyPropsspanAbout): Self = StObject.set(x, "typography", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypographyUndefined: Self = StObject.set(x, "typography", js.undefined)
  }
}

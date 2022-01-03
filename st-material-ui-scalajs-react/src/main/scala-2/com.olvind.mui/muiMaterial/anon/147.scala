package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `147` extends StObject {
  
  var defaultProps: js.UndefOr[PartialOptions] = js.native
}
object `147` {
  
  @scala.inline
  def apply(): `147` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`147`]
  }
  
  @scala.inline
  implicit class `147MutableBuilder`[Self <: `147`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialOptions): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
  }
}

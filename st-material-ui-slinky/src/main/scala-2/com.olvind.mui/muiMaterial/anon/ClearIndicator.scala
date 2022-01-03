package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearIndicator extends StObject {
  
  var clearIndicator: js.UndefOr[PartialIconButtonPropsIconButtonTypeMapb] = js.native
}
object ClearIndicator {
  
  @scala.inline
  def apply(): ClearIndicator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearIndicator]
  }
  
  @scala.inline
  implicit class ClearIndicatorMutableBuilder[Self <: ClearIndicator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearIndicator(value: PartialIconButtonPropsIconButtonTypeMapb): Self = StObject.set(x, "clearIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearIndicatorUndefined: Self = StObject.set(x, "clearIndicator", js.undefined)
  }
}

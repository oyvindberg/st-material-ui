package com.olvind.mui.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssignedNodesOptions extends StObject {
  
  /* standard dom */
  var flatten: js.UndefOr[Boolean] = js.native
}
object AssignedNodesOptions {
  
  @scala.inline
  def apply(): AssignedNodesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssignedNodesOptions]
  }
  
  @scala.inline
  implicit class AssignedNodesOptionsMutableBuilder[Self <: AssignedNodesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlatten(value: Boolean): Self = StObject.set(x, "flatten", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlattenUndefined: Self = StObject.set(x, "flatten", js.undefined)
  }
}

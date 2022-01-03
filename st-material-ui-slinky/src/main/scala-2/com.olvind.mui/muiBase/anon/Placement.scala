package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.popperUnstyledPopperUnstyledMod.PopperPlacementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Placement extends StObject {
  
  var TransitionProps: js.UndefOr[In] = js.native
  
  var placement: PopperPlacementType = js.native
}
object Placement {
  
  @scala.inline
  def apply(placement: PopperPlacementType): Placement = {
    val __obj = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Placement]
  }
  
  @scala.inline
  implicit class PlacementMutableBuilder[Self <: Placement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlacement(value: PopperPlacementType): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionProps(value: In): Self = StObject.set(x, "TransitionProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionPropsUndefined: Self = StObject.set(x, "TransitionProps", js.undefined)
  }
}

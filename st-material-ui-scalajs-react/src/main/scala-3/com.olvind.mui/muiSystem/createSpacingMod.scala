package com.olvind.mui.muiSystem

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createSpacingMod {
  
  @js.native
  trait Spacing extends StObject {
    
    def apply(): String = js.native
    def apply(topBottom: SpacingArgument, rightLeft: SpacingArgument): String = js.native
    def apply(top: SpacingArgument, rightLeft: SpacingArgument, bottom: SpacingArgument): String = js.native
    def apply(top: SpacingArgument, right: SpacingArgument, bottom: SpacingArgument, left: SpacingArgument): String = js.native
    def apply(value: Double): String = js.native
  }
  
  type SpacingArgument = Double | String
  
  type SpacingOptions = Double | Spacing | (js.Function1[(/* abs */ Double) | String, Double | String]) | (js.Array[String | Double])
}

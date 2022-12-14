package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.ratingRatingClassesMod.RatingClasses
import com.olvind.mui.muiMaterial.ratingRatingMod.RatingProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ratingMod {
  
  @JSImport("@mui/material/Rating", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: RatingProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def getRatingUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRatingUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/Rating", "ratingClasses")
  @js.native
  val ratingClasses: RatingClasses = js.native
}

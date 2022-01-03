package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.radioClassesMod.RadioClasses
import com.olvind.mui.muiMaterial.radioRadioMod.RadioProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioMod {
  
  @JSImport("@mui/material/Radio", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: RadioProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def getRadioUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRadioUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/Radio", "radioClasses")
  @js.native
  val radioClasses: RadioClasses = js.native
}

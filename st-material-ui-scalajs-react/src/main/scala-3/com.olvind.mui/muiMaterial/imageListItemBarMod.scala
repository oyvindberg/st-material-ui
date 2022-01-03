package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.imageListItemBarClassesMod.ImageListItemBarClasses
import com.olvind.mui.muiMaterial.imageListItemBarImageListItemBarMod.ImageListItemBarProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageListItemBarMod {
  
  @JSImport("@mui/material/ImageListItemBar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: ImageListItemBarProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def getImageListItemBarUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getImageListItemBarUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/ImageListItemBar", "imageListItemBarClasses")
  @js.native
  val imageListItemBarClasses: ImageListItemBarClasses = js.native
}

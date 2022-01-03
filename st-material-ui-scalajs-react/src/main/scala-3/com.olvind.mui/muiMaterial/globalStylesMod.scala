package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.globalStylesGlobalStylesMod.GlobalStylesProps
import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalStylesMod {
  
  @JSImport("@mui/material/GlobalStyles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: GlobalStylesProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}

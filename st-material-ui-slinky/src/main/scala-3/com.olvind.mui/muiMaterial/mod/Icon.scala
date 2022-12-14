package com.olvind.mui.muiMaterial.mod

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsIconTypeMapspan
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Demos:
  *
  * - [Icons](https://mui.com/material-ui/icons/)
  * - [Material Icons](https://mui.com/material-ui/material-icons/)
  *
  * API:
  *
  * - [Icon API](https://mui.com/material-ui/api/icon/)
  */
/* Inlined (props : DefaultComponentProps<IconTypeMap<{}, 'span'>> & {}): react.react.<global>.JSX.Element & {  muiName :string} */
object Icon {
  
  inline def apply(props: DefaultComponentPropsIconTypeMapspan): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@mui/material", "Icon")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material", "Icon.muiName")
  @js.native
  def muiName: String = js.native
  inline def muiName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("muiName")(x.asInstanceOf[js.Any])
}

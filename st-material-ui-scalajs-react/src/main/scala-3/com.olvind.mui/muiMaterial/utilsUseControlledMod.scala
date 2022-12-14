package com.olvind.mui.muiMaterial

import com.olvind.mui.muiUtils.useControlledMod.UseControlledProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsUseControlledMod {
  
  @JSImport("@mui/material/utils/useControlled", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](props: UseControlledProps[T]): js.Tuple2[T, js.Function1[/* newValue */ T | (js.Function1[/* prevValue */ T, T]), Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[T, js.Function1[/* newValue */ T | (js.Function1[/* prevValue */ T, T]), Unit]]]
}

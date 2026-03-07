library(testthat)

test_that("sumar funciona", {
  expect_equal(sumar(2,3), 5)
  expect_equal(sumar(2,-3), -1)
})

test_that("es_par funciona", {
  expect_true(es_par(8))
  expect_false(es_par(19))

})

test_that("es_multiplode3 funciona", {
  expect_true(es_multiplode3(9))
  expect_false(es_multiplode3(10))

})
